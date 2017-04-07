/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.launcher3;

import android.content.SharedPreferences;

/**
 * This interface defines the set of methods that the Launcher activity exposes. Methods
 * here should be safe to call from classes outside of com.android.launcher3.*
 */
public interface LauncherExterns {

    public boolean setLauncherCallbacks(LauncherCallbacks callbacks);

    public SharedPreferences getSharedPrefs();

    public void setLauncherOverlay(Launcher.LauncherOverlay overlay);

    void clearTypedText();
}
