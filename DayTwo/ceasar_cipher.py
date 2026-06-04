def getEncryption(word, shift):
    encrypted = ""
    for index in range(len(word)):
        ch = word[index] 
        
        if 'A' <= ch <= 'Z':
            ch= chr(ord(ch) + shift)

            if ch > 'Z':
                ch = chr(ord(ch)-26)


        encrypted += ch
return encrypted

def getDecryption(word, shift):
    dcrypted= ""

    for index in range(len(word)):
    ch = word[index]

    if'A' <= ch <= 'Z':
        ch = chr(ord(ch)-shift)
        
        if ch > 'Z':
            ch = chr(ord(ch)+ 26)
    dcrypted += ch
return dcrypted
        
        

