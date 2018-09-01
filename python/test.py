def animate(speed, init):
    
    output_array = []

    output_array.append()




def to_state_rep(init):
    
    L = []
    R = []

    for c in init:
        if c == '.':
            L.append('.')
            R.append('.')
        elif c == 'L':
            L.append('X')
            R.append('.')
        elif c == 'R':
            L.append('.')
            R.append('X')

    return L,R

def to_string_rep(L, R):
    output = ''

    for l, r in zip(L,R):
        if l == 'X' or r == 'X':
            output = output + 'X'
        else:
            output = output + '.'

    return output


print to_string_rep(*to_state_rep('RR..LRL'))