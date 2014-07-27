/*
 * Copyright 2014 Rik van der Kleij

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.powertuple.intellij.haskell.formatter.settings;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class HaskellCodeStyleSettings extends CustomCodeStyleSettings {
    protected HaskellCodeStyleSettings(CodeStyleSettings settings) {
        super("HaskellCodeStyleSettings", settings);
    }

    public boolean INDENT_WHERE_WITH_TAB_SIZE = true;
    public boolean INDENT_DO_WITH_TAB_SIZE = true;
}