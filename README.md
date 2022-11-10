# EncryptSecurityFile

Step 1. Add it in your root build.gradle at the end of repositories:

allprojects { <br />
&emsp;&emsp;&emsp;repositories { <br />
&emsp;&emsp;&emsp;&emsp;... <br />
&emsp;&emsp;&emsp;&emsp;maven { url 'https://jitpack.io' } <br />
&emsp;&emsp;&emsp;} <br />
} <br />
  
Step 2. Add the dependency

dependencies { <br />
&emsp;&emsp;implementation 'com.github.davit33:EncrypeSecurityFile:Tag' <br />
} <br />
