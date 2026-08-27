# cs314-hygiene-checker

A tool that makes sure your CS314 code adheres to the [hygiene guide](https://www.cs.utexas.edu/~scottm/cs314/handouts/hygiene_guide/code_hygiene_guide_framed.html)

Currently, this guide is written for VSCode users. If you'd like to write a guide for another IDE, open a PR.

## Installation

Make sure you have [checkstyle](https://github.com/checkstyle/checkstyle/releases/) installed on your computer.

Next, install these VSCode Extensions:

* Checkstyle
* Checkstyle for Java
* Language Support for Java(TM) by Red Hat

Install `checkstyle.xml` and `format.xml` and put them somewhere easily accessible on your computer.

Then open the VSCode settings page (`Ctrl + ,`), click the `Open Settings (JSON)` icon in the top right corner, and paste the contents of `settings.json` at the end.
It should look something like this:

``` json
{
    ..... Rest of your settings
    "java.format.settings.url": "~/dotfiles/stow/code/.config/Code/format_spec/java.xml",
    "java.checkstyle.configuration": "/home/valerius/dotfiles/stow/code/.config/Code/checkstyle/java.xml",
    "java.checkstyle.autocheck": true,
    "checkstyle.configurationPath": "/home/valerius/dotfiles/stow/code/.config/Code/checkstyle/java.xml"
}
```

## Components

There are two main ways that we check against the hygiene guide:

* Checkstyle (linter)
  * This is found at [`checkstyle.xml`](./checkstyle.xml).
  * This is used to highlight warnings found throughout your code, and where the bulk of checks list.
* Formatter
  * Found at [`format.xml`].
  * This is used to make sure your code is formatted correctly, and can be setup to automatically format your code.

## Unsupported Checks

This is a list of all checks that cannot be verified by either the linter or the formatter.
Most of them are due to being too vague or too difficult for a program to check.

* 1.3.1 Violation of Restrictions - Zero on Assignment
* 1.3.4. Minimize the scope of variables to the smallest necessary.
* 1.3.6. Comment judiciously (but do comment!)
* 3.2 Spacing Blank line before method comment
* 3.5 Exceptions, especially for failure to meet preconditions
* 3.6 Curly braces [Preferred, but you can use alternative brace styles]
* 3.8 Remove unnecessary and unneeded code
* 4. Commenting - Every Rule
* 5.1 - Every Rule
* 5.2 - Every Rule
* 5.3 - Every Rule
* 5.5 Scope
* 5.7 Preconditions and Exceptions
* 5.8 Remove unnecessary and unneeded code - REPEATED
* 6.2 Descriptiveness
* 6.3 Method names
* 7. Data Types - Every Rule
* 8. Efficiency and Redundancy

If you would like to try and implement them, open a PR, and make sure that the rule is as restrictive as possible.
