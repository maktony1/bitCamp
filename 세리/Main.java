    <style>
        #content {	//id�� content�� ���� ����
            width:300px;
        }

        ul li {		// �ļ�, ul �±� �ؿ� �ִ� ��� li �±� ����
            list-style:none;	// li�±׸� ���� ��Ÿ���� �ܸ�� ���ִ� ��
            border:1px solid #cccccc;
            padding:10px;
            background-color:#efefef;
            font-weight:bold;
            font-size:20px;
        }

        ul li a { 		//�ļ�, ul �±� �ؿ� li�±� �ؿ� �ִ� ���  a �±� ����
            color:#000000;
        }

        ul li:nth-child(2n+1) {		//�ļ�, ul�±� �ؿ� li �±� �߿� 2n+1 ��, Ȧ���� �͸� ����
            background-color:#de9393;
        }

        ul li:first-child, ul li:last-child {	//�ļ�, ul �±� �ؿ� ù��°�� ������ li ����
            background-color:yellow;
        }

        ul li:first-child {	//�ļ�, ul�±� �ؿ� ù��° li �±� ����
            border-radius:10px 10px 0 0;// border�� �׵θ�, radius�� �ձ۰� ����. ���� ��� �𼭸����� �ð��������
        }// ����,������ ��� �𼭸� 10px��ŭ �ձ۰� ������,���� �ϴ� �𼭸� 0

        ul li:last-child {	
            border-radius:0 0 10px 10px;//���� ���������� �Ʒ� ���� �𼭸� 10px��ŭ �ձ۰�
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