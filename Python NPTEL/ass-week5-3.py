def char_frequency(s):
    char_dict = {}
    for char in s:
        if char not in char_dict:
            char_dict[char] = s.count(char)
    return dict(sorted(char_dict.items(), key=lambda x: x[1], reverse=True))
