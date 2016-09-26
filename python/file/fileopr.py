
import os


# os.curdir
#os.getcwd() will give the actual directory where python process is invoked

currdir = os.path.dirname(__file__)

def readFile (filename):
    'Reading a file'
    sampleFile = open(currdir + '/' + filename, 'r+')
    content = sampleFile.read();
    sampleFile.close()
    return content

def writeFile (filename, content):
    'writing a file'
    writeFile = open(currdir +  '/' + filename, 'w')
    writeFile.write(stdin);
    writeFile.close()
    print ('File %s writen successfully' % (filename), end ='\n\n')
    return


# reading input from keybooard
stdin = input('Enter something :')
writeFile('write.txt', stdin);
print (readFile('write.txt'))

# Read from file.
# sampleFile = open(currdir + '/sample.txt', 'r+')
# content = sampleFile.read();
# print (content)
# sampleFile.close()
print (readFile('sample.txt'))



os.mkdir('new_directory')
os.rmdir('new_directory')
os.rename(currdir + '/write.txt', currdir + '/writerenamed.txt')

