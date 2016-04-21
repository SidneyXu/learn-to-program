# import
import utils

utils.StrUtils.echo()  # 10 20
utils.StrUtils.cout()  # 10 20
print(utils.StrUtils.COUNT)  # 20
print(utils.COUNT)  # 10

# from import
from utils import StrUtils

sentents = ['z', 'b', 'e', 'p']
print(StrUtils.sort_words(sentents))

# alias
import utils as helper

print(helper.COUNT)

# module searching path
import sys

print(sys.path)

print(__name__)  # __main__
print(helper.__name__)  # utils

from foopkg.calculator import add

print(add(3, 4))


#
# # 一个模块就是一个py文件
# # 模块的搜索路径
# import sys
# print(sys.path)
#
# # package
# # 文件夹名即包名，创建包
# # 在文件加下创建 __init__.py 文件，内容可以为空
