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

This requests of four inputs, which are `processor_type`, `description`, `developer_name`. Note that `processor_type` must be all lowercase and may only contain characters (no numbers, special chars).

Cookiecutter is a python tool, you can install it via `pip install cookiecutter` (or maybe use `pip3` if on osx). You can read more about cookiecutter [here](https://cookiecutter.readthedocs.io)

If you just want to create a plugin with all the default values, you can run cookiecutter with the `--no-input` parameter.

If you need to create a plugin for a specific Elasticsearch version that is
probably not the latest, you can go through the commit history and just
checkout the specific revision.
