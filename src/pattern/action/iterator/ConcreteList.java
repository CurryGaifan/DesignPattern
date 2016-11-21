package pattern.action.iterator;

public class ConcreteList extends AbstractList {
    @Override
    public Iterator createIterator(AbstractList list) {
        return new ConcreteIterator(list);
    }


    private class ConcreteIterator implements Iterator {
        private AbstractList list;
        private int cursor;

        public ConcreteIterator(AbstractList list) {
            this.list = list;
        }

        @Override
        public void next() {
            cursor++;
        }

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public boolean isDone() {
            return cursor >= list.size();
        }

        @Override
        public Object currentItem() {
            if (cursor < list.size()) {
                return list.get(cursor);
            }
            return null;
        }
    }
}
