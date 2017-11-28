# stackoverflow-springboot-web-app
Data sample - https://www.kaggle.com/stackoverflow/stacksample

Data Subsampling

Question Table
Id	OwnerUserId	CreationDate	ClosedDate	Score	Title	Body
80	26	2008-08-01T13:57:07Z	NA	26	SQLStatement.execute() - multiple queries in one statement	"<p>I've written a database generation script in <a href=""http://en.wikipedia.org/wiki/SQL"">SQL</a> and want to execute it in my <a href=""http://en.wikipedia.org/wiki/Adobe_Integrated_Runtime"">Adobe AIR</a> application:</p>

<pre><code>Create Table tRole (
      roleID integer Primary Key
      ,roleName varchar(40)
);
Create Table tFile (
    fileID integer Primary Key
    ,fileName varchar(50)
    ,fileDescription varchar(500)
    ,thumbnailID integer
    ,fileFormatID integer
    ,categoryID integer
    ,isFavorite boolean
    ,dateAdded date
    ,globalAccessCount integer
    ,lastAccessTime date
    ,downloadComplete boolean
    ,isNew boolean
    ,isSpotlight boolean
    ,duration varchar(30)
);
Create Table tCategory (
    categoryID integer Primary Key
    ,categoryName varchar(50)
    ,parent_categoryID integer
);
...
</code></pre>

<p>I execute this in Adobe AIR using the following methods:</p>

<pre><code>public static function RunSqlFromFile(fileName:String):void {
    var file:File = File.applicationDirectory.resolvePath(fileName);
    var stream:FileStream = new FileStream();
    stream.open(file, FileMode.READ)
    var strSql:String = stream.readUTFBytes(stream.bytesAvailable);
    NonQuery(strSql);
}

public static function NonQuery(strSQL:String):void
{
    var sqlConnection:SQLConnection = new SQLConnection();
    sqlConnection.open(File.applicationStorageDirectory.resolvePath(DBPATH);
    var sqlStatement:SQLStatement = new SQLStatement();
    sqlStatement.text = strSQL;
    sqlStatement.sqlConnection = sqlConnection;
    try
    {
        sqlStatement.execute();
    }
    catch (error:SQLError)
    {
        Alert.show(error.toString());
    }
}
</code></pre>

<p>No errors are generated, however only <code>tRole</code> exists. It seems that it only looks at the first query (up to the semicolon- if I remove it, the query fails). Is there a way to call multiple queries in one statement?</p>
"



Answer Table 
Id	OwnerUserId	CreationDate	ParentId	Score	Body
92	61	2008-08-01T14:45:37Z	90	13	"<p><a href=""http://svnbook.red-bean.com/"">Version Control with Subversion</a></p>

<p>A very good resource for source control in general. Not really TortoiseSVN specific, though.</p>"

Tags
Id	Tag
80	flex


