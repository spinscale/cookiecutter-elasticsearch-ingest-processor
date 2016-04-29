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

package {{ cookiecutter.package_name }};

import org.elasticsearch.common.Strings;
import org.elasticsearch.ingest.core.AbstractProcessor;
import org.elasticsearch.ingest.core.AbstractProcessorFactory;
import org.elasticsearch.ingest.core.IngestDocument;

import java.io.IOException;
import java.util.Map;

import static org.elasticsearch.ingest.core.ConfigurationUtils.readOptionalList;
import static org.elasticsearch.ingest.core.ConfigurationUtils.readStringProperty;

public class {{ cookiecutter.class_name_processor }} extends AbstractProcessor {

    public static final String TYPE = "{{ cookiecutter.processor_type }}";

    private final String field;
    private final String targetField;

    public {{ cookiecutter.class_name_processor }}(String tag, String field, String targetField) throws IOException {
        super(tag);
        this.field = field;
        this.targetField = targetField;
    }

    @Override
    public void execute(IngestDocument ingestDocument) throws Exception {
        String content = ingestDocument.getFieldValue(field, String.class);
        // TODO implement me!
        ingestDocument.setFieldValue(targetField, content);
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public static final class Factory extends AbstractProcessorFactory<{{ cookiecutter.class_name_processor }}> {

        @Override
        public {{ cookiecutter.class_name_processor }} doCreate(String processorTag, Map<String, Object> config) throws Exception {
            String field = readStringProperty(TYPE, processorTag, config, "field");
            String targetField = readStringProperty(TYPE, processorTag, config, "target_field", "default_field_name");

            return new {{ cookiecutter.class_name_processor }}(processorTag, field, targetField);
        }
    }
}
