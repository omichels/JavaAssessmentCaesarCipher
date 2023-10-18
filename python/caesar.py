def caesar(plainText, shift): 
    cipherText = ""
    for ch in plainText:
        if ch.isalpha():
            stayInAlphabet = ord(ch) + shift 
            if stayInAlphabet > ord('z'):
                stayInAlphabet -= 26
            finalLetter = chr(stayInAlphabet)
        cipherText += finalLetter

    return cipherText



#check the above function
text = "CEASER CIPHER DEMO"
s = 1

print("Plain Text : " + text)
print("expected CIPHER: DFBTFSSDJQIFSSEFNP")
print("your     Cipher: " + caesar(text,s))
