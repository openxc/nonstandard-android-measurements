#!/bin/sh

CURRENT_BRANCH=`git symbolic-ref HEAD 2>/dev/null | awk -F/ {'print $NF'}`
git checkout master
mvn clean package javadoc:javadoc
TEMP_PATH=/tmp/openxc-nonstandard-measurements-apidocs
rm -rf $TEMP_PATH
cp -R target/apidocs $TEMP_PATH
git checkout gh-pages
rm -rf *.html references assets reference resources
cp -R $TEMP_PATH/* .
git add -A
git commit -m "Update Javadocs."
git push
git checkout $CURRENT_BRANCH
