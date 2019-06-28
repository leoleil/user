#!/usr/bin/env bash

echo "$0 $@"
set -e
#logDir="/Users/breakpoint/Downloads/logs"
logDir=$1;
absolutePath=`pwd`;
for i in `ls ${logDir}`;
    do
       #`enconv -L zh_CN -x UTF-8 ${i}`;#转码
       echo ${absolutePath}${i} ${i}
    done
