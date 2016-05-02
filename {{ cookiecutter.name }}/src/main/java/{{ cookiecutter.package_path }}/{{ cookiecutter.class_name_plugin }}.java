/*
 * Copyright [2016] [{{ cookiecutter.developer_name }}]
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
 *
 */

package org.elasticsearch.plugin.ingest.{{ cookiecutter.processor_type }};

import org.elasticsearch.common.settings.Setting;
import org.elasticsearch.common.settings.SettingsModule;
import org.elasticsearch.node.NodeModule;
import org.elasticsearch.plugins.Plugin;

import java.io.IOException;
import java.nio.file.Path;

public class {{ cookiecutter.class_name_plugin }} extends Plugin {

    public static final Setting<String> YOUR_SETTING =
            new Setting<>("ingest.{{ cookiecutter.processor_type }}.setting", "foo", (value) -> value, Setting.Property.NodeScope);

    @Override
    public String name() {
        return "ingest-{{ cookiecutter.processor_type }}";
    }

    @Override
    public String description() {
        return "{{ cookiecutter.description }}";
    }

    public void onModule(SettingsModule settingsModule) {
        settingsModule.registerSetting(YOUR_SETTING);
    }

    public void onModule(NodeModule nodeModule) throws IOException {
        nodeModule.registerProcessor({{ cookiecutter.class_name_processor }}.TYPE,
                (templateService, registry) -> new {{ cookiecutter.class_name_processor }}.Factory());
    }

}
