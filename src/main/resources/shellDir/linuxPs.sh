#!/usr/bin/env bash
#ps -ef|grep -i -R -w -n 'controller' /Users/breakpoint/Downloads/logs
#根据关键字进行查询操作
echo "$0 $@"
set -e
#初始值的赋值
absolutePath=`pwd`;
keywords=$1;
logDir=$2;
pageStart=$3;#开始页
pageSize=$4;#每个页大小
#logDir="/Users/breakpoint/Downloads/logs"
#logDir=$5;

#输出的文件
outputFileName="outputLinuxPS.txt";

IFS_old=$IFS
IFS=$'\n'

echo "ps -ef|grep -i -R -w -n" ${keywords} ${logDir};

`ps -ef|grep -i -R -w -n ${keywords} ${logDir} &> ${outputFileName}`

#统计多少页
echo pages:`cat ${outputFileName}|wc -l`;


#显示文件的第10行之后的30行
#
#cat filename |tail -n  +10 |head -n 30
for i in `cat ./${outputFileName} |tail -n  +${pageStart} |head -n ${pageSize}`;
    do
       echo ${i}
    done

IFS=${IFS_old}