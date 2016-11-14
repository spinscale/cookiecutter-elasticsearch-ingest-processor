from cookiecutter.main import cookiecutter

import re
import sys
import os

REGEX = r'^[-_a-z]+$'
processor_type = '{{ cookiecutter.processor_type }}'

if not re.match(REGEX, processor_type):
    print('ERROR: %s is not a valid processor type name! Use only alphabetic lower case chars.' % processor_type)
    # exits with status 1 to indicate failure
    sys.exit(1)

