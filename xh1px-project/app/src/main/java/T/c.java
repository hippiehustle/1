package T;

import A.j;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import o.Y0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5479d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5480e;

    /* renamed from: f, reason: collision with root package name */
    public Cursor f5481f;

    /* renamed from: g, reason: collision with root package name */
    public int f5482g;

    /* renamed from: h, reason: collision with root package name */
    public a f5483h;

    /* renamed from: i, reason: collision with root package name */
    public b f5484i;
    public d j;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f5481f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f5483h;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f5484i;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f5481f = cursor;
            if (cursor != null) {
                a aVar2 = this.f5483h;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f5484i;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f5482g = cursor.getColumnIndexOrThrow("_id");
                this.f5479d = true;
                notifyDataSetChanged();
            } else {
                this.f5482g = -1;
                this.f5479d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f5479d && (cursor = this.f5481f) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (this.f5479d) {
            this.f5481f.moveToPosition(i4);
            if (view == null) {
                Y0 y02 = (Y0) this;
                view = y02.f13161m.inflate(y02.f13160l, viewGroup, false);
            }
            a(view, this.f5481f);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, T.d] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.j == null) {
            ?? filter = new Filter();
            filter.f5485a = this;
            this.j = filter;
        }
        return this.j;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (this.f5479d && (cursor = this.f5481f) != null) {
            cursor.moveToPosition(i4);
            return this.f5481f;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (!this.f5479d || (cursor = this.f5481f) == null || !cursor.moveToPosition(i4)) {
            return 0L;
        }
        return this.f5481f.getLong(this.f5482g);
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (this.f5479d) {
            if (this.f5481f.moveToPosition(i4)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f5481f);
                return view;
            }
            throw new IllegalStateException(j.l("couldn't move cursor to position ", i4));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
