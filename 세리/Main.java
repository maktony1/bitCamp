    <style>
        #content {	//id가 content인 것을 선택
            width:300px;
        }

        ul li {		// 후손, ul 태그 밑에 있는 모든 li 태그 선택
            list-style:none;	// li태그를 쓰면 나타나는 ●모양 없애는 것
            border:1px solid #cccccc;
            padding:10px;
            background-color:#efefef;
            font-weight:bold;
            font-size:20px;
        }

        ul li a { 		//후손, ul 태그 밑에 li태그 밑에 있는 모든  a 태그 선택
            color:#000000;
        }

        ul li:nth-child(2n+1) {		//후손, ul태그 밑에 li 태그 중에 2n+1 즉, 홀수인 것만 선택
            background-color:#de9393;
        }

        ul li:first-child, ul li:last-child {	//후손, ul 태그 밑에 첫번째와 마지막 li 선택
            background-color:yellow;
        }

        ul li:first-child {	//후손, ul태그 밑에 첫번째 li 태그 선택
            border-radius:10px 10px 0 0;// border는 테두리, radius는 둥글게 선언. 왼쪽 상단 모서리부터 시계방향으로
        }// 왼쪽,오른쪽 상단 모서리 10px만큼 둥글게 오른쪽,왼쪽 하단 모서리 0

        ul li:last-child {	
            border-radius:0 0 10px 10px;//위와 마찬가지로 아래 양쪽 모서리 10px만큼 둥글게
        }
    </style>

</head>
<body>

    <div id="content">
        <ul>
            <li><a href="#">menu1</a></li>
            <li><a href="#">menu2</a></li>
            <li><a href="#">menu3</a></li>
            <li><a href="#">menu4</a></li>
            <li><a href="#">menu5</a></li>
            <li><a href="#">menu6</a></li>
            <li><a href="#">menu7</a></li>
            <li><a href="#">menu8</a></li>