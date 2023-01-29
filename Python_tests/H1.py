h=[" +----+",
   " |    |",
   "      |",
   "      |",
   "      |",
   "______|",
]
def hman():
    for i in h:
        print(i,end="\n")
def mistake(m):
    if(m==0):
        hman()
    else:    
        for i in range(1,m+1):
            if(i==1):
                h[2]=" O    |"
            elif(i==2):    
                h[3]="/     |"
            elif(i==3):
                h[3]="/|    |"
            elif(i==4):
                h[3]="/|\   |"
            elif(i==5):
                h[4]="/     |"
            elif(i==6):
                h[4]="/ \   |"
        hman()                