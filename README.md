# A cookiecutter template for an Elasticsearch Ingest Processor

This should simplify the creation of Elasticsearch Ingest Processors, this template will set up

* A processor class
* A plugin class
* A processor unit test
* Two REST tests

All you need to run is

```bash
cookiecutter gh:spinscale/cookiecutter-elasticsearch-ingest-processor
```

This requests a couple of inputs. I think the only ones you really need to edit are `processor_type`, `description`, `developer_name` (which is put into the license header) and potentially `elasticsearch_version`, if you use a different version. The other ones are all based on the processor and should be left as is.

Cookiecutter is a python tool, you can install it via `pip install cookiecutter` (or maybe use `pip3` if on osx). You can read more about cookiecutter [here](https://cookiecutter.readthedocs.io)

If you just want to create a plugin with all the default values, you can run cookiecutter with the `--no-input` parameter.

# Limitations

* Right now your processor name should only be a single word and not contain dashes, otherwise java compilation will fail.

