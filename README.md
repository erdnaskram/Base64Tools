# Base64Tools

Base64Tools is a simple java-based tool to encode and decode files via base64.
Link to the GitHub repository: [Base64Tools](https://github.com/erdnaskram/Base64Tools)
***

For using these tools you simply copy the path (including the file name) of the file you want to encode/decode and paste
it in the command line after the command. 

## File to Base64-TXT

Use [FieletoBase64.java](https://github.com/erdnaskram/Base64Tools/blob/main/FiletoBase64.java)  to encode files to
base64 strings and store them in a txt-file.
The command line will look like this:

```shell
java FiletoBase64.java
```
Example:
```shell
Geben Sie den Dateipfad und -namen ein: "C:\Users\erdnaskram\Downloads\archive.zip"
Die Datei wurde erfolgreich kodiert und als C:\Users\erdnaskram\Downloads\archive.txt gespeichert.
```

## Base64-TXT to File

Use [Base64toFile_2.java](https://github.com/erdnaskram/Base64Tools/blob/main/Base64toFile_2.java) to decode base64
strings to files. The base64 strings have to be stored in a txt-file.
The command line will look like this:

```shell
java Base64toFile_2.java
```
Example:
```shell
Geben Sie den Dateipfad inkl. Name ein: "C:\Users\erdnaskram\Downloads\archive.txt"
Die Datei wurde erfolgreich dekodiert und als C:\Users\erdnaskram\Downloads\archive.zip gespeichert.
```

### Base64-TXT to File (with file type)
If you want to decode base64 strings to other file types, you can use
[Base64toFile_2_1.java](https://github.com/erdnaskram/Base64Tools/blob/main/Base64toFile_2_1.java).
There you can specify the file type in the command line.
The command line will look like this:

```shell
java FiletoBase64.java
```
Example:
```shell
Geben Sie den Dateipfad und -namen ein: "C:\Users\erdnaskram\Downloads\movie.txt"
Geben Sie den Dateityp ein (z.B. .zip): .mp4
Die Datei wurde erfolgreich dekodiert und als C:\Users\erdnaskram\Downloads\movie.mp4 gespeichert.
```