# Lesson 1

## 一些编程词汇 👨🏻‍💻
- `编程`：coding/programming
- `编译器`：compiler
- `编译器`：compile
- `编程语言`：programming language: C, C++, Python, Javascript, Go，swift...
- `文本编辑器`： text editor
- `浏览器`：browser

## 基础问题
1. What is programming/coding? 什么是编程？
- 可以把电脑理解为是一个机器人，可以不停歇的工作，你可以给他一些指令。比如说“请你帮我拿个蛋糕”，“请你帮我关个门”。 你说出这个指令的过程就是“编程”。学习指令怎么说的过程就是学习软件的相关知识，而硬件相关的知识就是了解机器人怎么造

2. What is a programming language? 编程语言到底是什么?
- A programming language is a set of instructions. 
- computer doesn't understand human language
- Then what does computer speak?
- Computer speaks ones and zeros, or almost all electronics device speaks ones and zeros (machine language)
- But, writing in zeros and ones would be impossible for us...
- Human develop new language called programming language that are in between human language and machine language.
- programming language will later been compiled or interpreted(translate) by a compiler or interpreter to become machine code so computer can understand.

## 学习大纲
1. 几个学习方向
- 编程基础
- 软件开发
- 算法研究
- 操作系统
- 电脑构造
- ...

2. 题外话 
- 合理的使用谷歌 （Google is our good friend!:)
- stackoverflow

# 今日课题
1. 你将来的好朋友github 👏🏻<br/>
`Github url`: https://github.com<br/>
✅任务1：创建Github账号</br>
✅任务2: 学会一些基本git指令

2. 网页是如何被搭建的？
- `HTML` (骨骼) +`CSS` （皮肤） + `JS`（灵魂）

3. HTML 是什么？
- `HTML` is the standard markup language for creating Web pages.
- `HTML` = `Hyper Text Markup Language` （超文本标记语言）
- `HTML` describes the structure of a Web page
- `HTML` has of a series of elements
- `HTML` elements tell the browser how to display the content
- `HTML` elements are represented by tags
- `HTML` tags(标签) label pieces of content such as "heading", "paragraph", "table", and so on
- `Browsers`（浏览器） do not display the HTML tags, but use them to render（渲染） the content of the page

```HTML
<!DOCTYPE html>
<html>

<head>
<title>Page Title</title>
</head>

<body>
<h1>My First Heading</h1>
<p>My first paragraph.</p>
</body>

</html>
```

- The `<!DOCTYPE html>` declaration defines this document to be HTML5
- The `<html>` element is the root element of an HTML page
- The `<head>` element contains meta information (document title, character set, styles, links, scripts) about the document. `Metadata` provides browsers and search engines with technical information about the web page
- The `<title>` element specifies a title for the document
- The `<body>` element contains the visible page content
- The `<h1>` element defines a large heading
- The `<p>` element defines a paragraph

# HTML Tags
- `HTML` tags are element names surrounded by angle brackets
- `<tagname> contents... </tagname>`
- `HTML` tags normally come in pairs like `<p>` and `</p>`
- The first tag in pair is the `start tag` (opening tag), the second tag is the `end tag`(closing tag)
- The `end tag` is written like the start tag, but with a `forward slash` inserted before the tag name

# HTML Headings </br>
- `HTML` headings are defined with the `<h1>` to `<h6>` tags
- `<h1>` defines the most important heading. `<h6>` defines the least important heading

```HTML
<h1>This is heading 1</h1>
<h2>This is heading 2</h2>
<h3>This is heading 3</h3>
```

# HTML Paragraphs
- `HTML` paragraphs are defined with the `<p>` tag

```HTML
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
```

# HTML Links
- `HTML` links are defined with `<a>` tag
- The link's destination is specified in the href attribute.
- `Attributes` are used to provide additional information about HTML elements.
- `Attributes` provide additional information about HTML elements.

```HTML
<a href="https://www.w3schools.com">This is a link</a>
```

# HTML Images
- `HTML` images are defined with `<img>` tag

```HTML
<img src="https://en.wikipedia.org/wiki/Pikachu#/media/File:Pokémon_Pikachu_art.png" alt="pikachu" width="104" height="142">
```

# HTML Button
- HTML buttons are defined with the `<button>` tag

```HTML
<button>Click me</button>
```

# HTML Lists
- HTML lists are defined with the `<ul>` (unordered/bullet list) or the `<ol>` (ordered/numbered list) tag, followed by `<li>` tags (list items)

```HTML
<ul>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ul>

<ol>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ol>
```

# 今日作业 👀
1. 自己用谷歌查找新的5个不同的html tags, 用英文写出他们是用来做什么的，保存为hw1.html提交到Homework branch
2. 熟悉github的一些指令

# References
- w3school<br/>
URL: https://www.w3schools.com/html/html_basic.asp