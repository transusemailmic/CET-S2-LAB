def top_student(stud_dict):
    mark_sum_dict={}
    for key,value in stud_dict.items():
        mark_sum_dict[key]=sum(value)
    mark_sum_dict=dict(sorted(mark_sum_dict.items(),key=lambda x:x[1]))
    top=max(mark_sum_dict.values())
    for key,value in mark_sum_dict.items():
        if value==top:
            return key