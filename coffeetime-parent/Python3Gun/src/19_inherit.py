class View:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def desc(self, prefix):
        return "{prefix} width = {width}, height = {height}" \
            .format(prefix=prefix, width=self.width, height=self.height)


class Button(View):
    def __init__(self, width, height, name):
        super().__init__(width, height)
        self.name = name

    # Invoke Parent Method
    def desc(self, prefix):
        return View.desc(self, prefix) + " ,name = {name}".format(name=self.name)


class ViewGroup(View):
    def __init__(self):
        pass


button = Button(480, 360, 'Simple Click')
print(button.desc(' => '))

view_group = ViewGroup()
View.__init__(view_group, 0, 0)
print(view_group.desc(' => '))


class RadioGroup(Button, ViewGroup):
    def __init__(self):
        super().__init__()
        self.index = 0


# Other Methods
print(issubclass(Button, View))  # True
print(issubclass(Button, Button))  # True
print(issubclass(Button, object))  # True

print(isinstance(button, View))  # True
print(isinstance(button, Button))  # True
print(isinstance(button, ViewGroup))  # False

print(hasattr(button, 'width'))  # True
print(getattr(button, 'not exist', 'default value'))  # default value
setattr(button, 'color', 'red')
print(getattr(button, 'color'))  # red
delattr(button, 'color')
