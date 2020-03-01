# PC端
2020年2月13日15:09:57
1. 将jframe类交给spring管理之后，启动报异常
   #answer 1. 修改springboot 启动类，改为 
   	SpringApplicationBuilder builder = new SpringApplicationBuilder(WindowExeApplication.class);
   		ApplicationContext applicationContext = builder.headless(false).run(args);
