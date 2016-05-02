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

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.ingest.RandomDocumentPicks;
import org.elasticsearch.ingest.core.IngestDocument;
import org.elasticsearch.test.ESTestCase;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;

public class {{ cookiecutter.class_name_processor }}Tests extends ESTestCase {

    public void testThatProcessorWorks() throws Exception {
        Map<String, Object> document = new HashMap<>();
        document.put("source_field", "fancy source field content");
        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random(), document);
        
        {{ cookiecutter.class_name_processor }} processor = new {{ cookiecutter.class_name_processor }}(randomAsciiOfLength(10), "source_field", "target_field");
        processor.execute(ingestDocument);
        Map<String, Object> data = ingestDocument.getSourceAndMetadata();

        assertThat(data, hasKey("target_field"));
        assertThat(data.get("target_field"), is("fancy source field content"));
        // TODO add fancy assertions here
    }
}

