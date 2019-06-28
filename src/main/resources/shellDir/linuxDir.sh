#!/usr/bin/env bash
#功能介绍  列举出莫哥文件夹下面的所有文件名称
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