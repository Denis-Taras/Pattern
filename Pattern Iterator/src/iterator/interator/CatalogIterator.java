package iterator.interator;

public class CatalogIterator implements MyIterator{
    
    private CatalogItem[] items;
    private int position;

    public CatalogIterator(CatalogItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public CatalogItem next() {
        CatalogItem catalogItem = items[position];
        position = position + 1;
        return catalogItem;
    }
}