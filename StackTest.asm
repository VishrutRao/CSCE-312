@17
D = A
@SP
A = M
M = D
@SP
M = M+1
@17
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@EQ.0
D;JEQ
@NEQ.0
0;JMP
(EQ.0)
@SP
A = A-1
M = -1
@EQ.0.after
0;JMP
(NEQ.0)
@SP
A = A-1
M = 0
(EQ.0.after)
@17
D = A
@SP
A = M
M = D
@SP
M = M+1
@16
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@EQ.1
D;JEQ
@NEQ.1
0;JMP
(EQ.1)
@SP
A = A-1
M = -1
@EQ.1.after
0;JMP
(NEQ.1)
@SP
A = A-1
M = 0
(EQ.1.after)
@16
D = A
@SP
A = M
M = D
@SP
M = M+1
@17
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@EQ.2
D;JEQ
@NEQ.2
0;JMP
(EQ.2)
@SP
A = A-1
M = -1
@EQ.2.after
0;JMP
(NEQ.2)
@SP
A = A-1
M = 0
(EQ.2.after)
@892
D = A
@SP
A = M
M = D
@SP
M = M+1
@891
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@LT.3
D;JLT
@NLT.3
0;JMP
(LT.3)
@SP
A = A-1
M = 1
(NLT.3)
@SP
A = A-1
M = 0
@891
D = A
@SP
A = M
M = D
@SP
M = M+1
@892
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@LT.4
D;JLT
@NLT.4
0;JMP
(LT.4)
@SP
A = A-1
M = 1
(NLT.4)
@SP
A = A-1
M = 0
@891
D = A
@SP
A = M
M = D
@SP
M = M+1
@891
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@LT.5
D;JLT
@NLT.5
0;JMP
(LT.5)
@SP
A = A-1
M = 1
(NLT.5)
@SP
A = A-1
M = 0
@32767
D = A
@SP
A = M
M = D
@SP
M = M+1
@32766
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@GT.6
D;JGT
@NGT.6
0;JMP
(GT.6)
@SP
A = A-1
M = 1
(NGT.6)
@SP
A = A-1
M = 0
@32766
D = A
@SP
A = M
M = D
@SP
M = M+1
@32767
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@GT.7
D;JGT
@NGT.7
0;JMP
(GT.7)
@SP
A = A-1
M = 1
(NGT.7)
@SP
A = A-1
M = 0
@32766
D = A
@SP
A = M
M = D
@SP
M = M+1
@32766
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
D = M-D
@GT.8
D;JGT
@NGT.8
0;JMP
(GT.8)
@SP
A = A-1
M = 1
(NGT.8)
@SP
A = A-1
M = 0
@57
D = A
@SP
A = M
M = D
@SP
M = M+1
@31
D = A
@SP
A = M
M = D
@SP
M = M+1
@53
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
M = D+M
@112
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
M = M-D
@SP
A = M-1
M = !M
@SP
AM = M-1
D = M
A = A-1
M = D&M
@82
D = A
@SP
A = M
M = D
@SP
M = M+1
@SP
AM = M-1
D = M
A = A-1
M = D|M
@SP
A = M-1
M = !M
