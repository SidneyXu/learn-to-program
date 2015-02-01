package org.mrseasons.coffeetime.groovy

/**
 * Created by mrseasons on 2015/1/31.
 */
//函数式语言中一项常见功能就是惰性列表：只在需要时才生成内容的列表。
// 惰性列表可以让您将代价高昂的资源初始化进程推迟至确实需要时才进行。他们还允许创建无穷序列：没有上限的列表。
class LazyList {
    private head, tail

    LazyList(head, tail) {
        this.head = head;
        this.tail = tail
    }

    def LazyList getTail() { tail ? tail() : null }

    def List getHead(n) {
        def valuesFromHead = [];
        def current = this
        n.times {
            valuesFromHead << current.head
            current = current.tail
        }
        valuesFromHead
    }

    def LazyList filter(Closure p) {
        if (p(head))
            p.owner.prepend(head, { getTail().filter(p) })
        else
            getTail().filter(p)
    }
}
