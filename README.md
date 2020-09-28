# binggr_blog

## 博客说明

页面:
页面模板来自于不落阁和X-admin
使用handyeditor富文本器作为写博客的编辑器
后台页面使用jsp+ajax+jq+json混合进行数据交互
前台页面使用ajax+jq+json进行数据交互

后端：
由ssm+lucene+shiro+log4j+tomcat8.5+mysql8.11+druid完成

ssm框架：用于整个项目的构建
lucene：作为博客的全文检索引擎，用于对关键字的检索，并高亮显示
shiro: 作为博客的权限管理，用于对用户的身份验证、权限设置
log4j:作为监控项目记录和排查项目bug
tomcat8.5：用于整个项目的部署
mysql8.11：用于数据的存储、修改

数据库表
博客表
博主表
评论表
博客类型表
友情链接表

主要功能
实现了常见管理功能（CRUD）还包括用于后台登录博主的身份验证（结合shiro）、写博客（结合handyeditor+文件上传）、评论审核(逻辑删除理念)、全文检索高亮结果（结合lucene）



