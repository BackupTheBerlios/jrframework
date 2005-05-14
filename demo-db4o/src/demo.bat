
@echo off

set fram=..\JavaApplication3

set cp=%fram%\dist\JavaApplication3.jar
set cp=%cp%;%fram%\lib\forms-1.0.3.jar
set cp=%cp%;%fram%\lib\looks-1.2.2.jar
set cp=%cp%;%fram%\lib\bsh-2.0b2.jar
set cp=%cp%;%fram%\lib\commons-beanutils.jar
set cp=%cp%;%fram%\lib\commons-beanutils-bean-collections.jar
set cp=%cp%;%fram%\lib\commons-beanutils-core.jar
set cp=%cp%;%fram%\lib\commons-collections-3.1.jar
set cp=%cp%;%fram%\lib\commons-digester.jar
set cp=%cp%;%fram%\lib\commons-logging.jar
set cp=%cp%;%fram%\lib\commons-logging-api.jar
set cp=%cp%;%fram%\lib\log4j-1.2.9.jar
set cp=%cp%;%fram%\icons
set cp=%cp%;lib\db4o-4.3-java1.4.jar


java -cp %cp%;build\classes metro.util.Main