# ConditionMatcher

## Background

Event was held in 2021/05, detail is as below:
https://maplestory.nexon.co.jp/notice/view/953201/?id=all

|公開日|なぞなぞ|答え|アイテム|
|5月2日(日)|
ヒント①
 散歩路\
ヒント②\
 以下から導き出される数字を手掛かりに\
　・7の倍数\
　・各桁の数の合計は11\
　・各桁の数を全てかけあわせると16\
ヒント③:合言葉\
 GM「かえでで花」の最後の台詞に含まれる\
英字の大文字だけをつなげて|
MCD|
嵐の成長の秘薬(1個)|

## Documents for this tool

7の倍数で、各桁の合計が11で、各桁の積が16な数字を探すプログラムです

## How to use

This program is written in Kotlin.\
So please install kotlin standalone compiler.

### On VSCode

Press `Command`+`Shift`+`B` key.\
The task to build and execute output is written in .vscode/tasks.json.

### Without tools

Execute below command:
```bash
$ kotlinc ./src/main/kotlin/com/stutx/conditionmatcher/*.kt ./src/main/kotlin/com/stutx/conditionmatcher/conditions/*.kt -include-runtime -d ./build/main.jar
$ java -jar ./build/main.jar
```
### Expected output

```bash
i: 182
i: 812
```
