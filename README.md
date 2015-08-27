android-whatever-api
========================

WhateverApi is an Android library that helps you to get ride of the boring code

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.SOME_ANDROID_API) {
        androidAwesomeMethod();
    } else {
        androidDeprecatedMethod();
    }

### Installation

Add this to your `build.gradle` file

	repositories {
	    maven {
	        url "https://jitpack.io"
	    }
	}

	dependencies {
	        compile 'com.github.quentin7b:whateverapi:1.0'
	}

Please note that *WhateverApi* has some dependencies:

	compile 'com.android.support:appcompat-v7:23.0.0'

### Use it

We wanted to do that as simple as it is.

If you know that your method is deprecated, just search for the class _*WEApi*classname_.

For example: the `Resources` [class of *android*](http://developer.android.com/reference/android/content/res/Resources.html) searchfor `WEApiResources` class

Once you have your *class*, every method is *public static*, so you can use it as it without creating an object

### Understand it

All the classes belongs to the package they are on android, but within `com.github.quentin7b`
For example, `Resources` of *android* is in `android.content.res`, so in *WhateverApi* it is in `com.github.quentin7b.android.content.res`

### Contribution

If something is missing and you want it. There are 2 ways to do that:
* open an issue and we'll add it (asap)
* fork, do it by yourself, pull request it and we'll review it (asap too)

If you add a method, just follow the way everything is done:

	/**
	 * Describes method <br />
	 * More info (optional, like min API) <br />
	 * Deprecated in API _No_
	 *
	 * @param all the params
	 * @return the return value
	 */
	 public static <returnType> recentApiCall(params) {
	 	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.DEPRECATED_API_VERSION) {
     		return recentApiCall(some, params);
     	} else {
        	return deprecatedApiCall(some, params);
     	}
	 }

Notice that the *signature* of the method should be the same in the *latest API*

Thanks :)

### Contact & Questions

If you have any questions, fell free to send me a mail.

### License

The MIT License (MIT)

Copyright (c) 2015 Quentin Klein

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.