# VoiceInput
A java voice input interface using iflytek voice dictation with dynamic correction
### A simple method to write words

I like to use voice input to write words. But I didn't find an easy to use voice dedication program with dynamic correction. So I made this one. A java voice input interface using iflytek voice dictation with dynamic correction.

**Github Page:** https://github.com/sjiang97/VoiceInput

**Compiled version:** https://github.com/sjiang97/VoiceInput/releases

**Code version:** https://github.com/sjiang97/VoiceInput/archive/0.1.zip

#### Sample run:

You need to choose a language to dedicate in bash window at first. Then a window below will be pushed out: 

Each button clarify what you could do clearly. 

![](https://raw.githubusercontent.com/sjiang97/sjiang97.github.io/master/2019/projects/AutoCommenter/3.png)

#### Usage

##### Creating configuration file and put it to the running directory

A model of configuration file as shown below:

```txt
-----special:-----
BAIDU_APP_ID: 
BAIDU_SECURITY_KEY: 
IFLY_APP_ID: 
```

``-----special:-----`` and ``-----conditions:-----`` are field tags, These field tags should matches exactly as what described above. 

###### Special field:

- BAIDU_APP_ID/BAIDU_SECURITY_KEY: Need register Baidu translation API at [here](http://api.fanyi.baidu.com/api/trans/product/index). No need to register if you don't plan to use translation function.
- IFLY_APP_ID: Need register with Ifly at [here](https://www.xfyun.cn/). No need to register if you don't plan to use voice dedication function 

#### Compile & run

##### Download from release page or compile from source.

###### Download from release page:

1. Choose correct library to download and download VoiceInput from release page
2. ``java -jar VoiceInput.jar ``

###### Download from release page:

1. ``git clone https://github.com/sjiang97/VoiceInput.git``
2. ``cd VoiceInput``
3. ``find -name "*.java" > sources.txt`` : Find all java files to compile
4. ``mkdir bin``
5. ``javac -d ./bin -cp ./\* @sources.txt``
6. ``cd bin``
7. ``java -classpath ./:../json-jena-1.0.jar:../Msc.jar Test``

#### Special notes:

**It requires oracle java 1.8(openjdk on linux) or above**
