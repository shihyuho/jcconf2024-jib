#!/bin/bash
set -e

# Perform any necessary steps before starting the JVM,
# such as setting JVM options or preparing the environment

exec java $(cat /app/jib-jvm-flags-file) \
  -cp $(cat /app/jib-classpath-file) \
  $(cat /app/jib-main-class-file) \
  "$@"
