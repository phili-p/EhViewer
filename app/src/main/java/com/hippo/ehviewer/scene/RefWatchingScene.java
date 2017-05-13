/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.scene;

/*
 * Created by Hippo on 5/11/2017.
 */

import android.support.annotation.NonNull;
import android.view.View;
import com.hippo.ehviewer.EhvApp;
import com.hippo.stage.Scene;

public abstract class RefWatchingScene extends Scene {

  @Override
  protected void onDestroyView(@NonNull View view) {
    super.onDestroyView(view);
    //noinspection ConstantConditions
    ((EhvApp) getApplication()).getRefWatcher().watch(view);
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    //noinspection ConstantConditions
    ((EhvApp) getApplication()).getRefWatcher().watch(this);
  }
}