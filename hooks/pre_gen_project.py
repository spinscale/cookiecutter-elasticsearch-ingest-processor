from cookiecutter.main import cookiecutter

import re
import sys
import os

REGEX = r'^[_a-zA-Z]+$'
processor_type = '{{ cookiecutter.processor_type }}'

if not re.match(REGEX, processor_type):
    print('ERROR: %s is not a valid processor type name! Use only alphabetic chars.' % processor_type)
    # exits with status 1 to indicate failure
    sys.exit(1)

