package T;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import o.Y0;

/* loaded from: classes.dex */
public final class d extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public c f5485a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((Y0) this.f5485a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        Y0 y02 = (Y0) this.f5485a;
        SearchView searchView = y02.f13162n;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = y02.g(y02.f13163o, charSequence2);
            } catch (RuntimeException e9) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e9);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f5485a;
        Cursor cursor = cVar.f5481f;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((Y0) cVar).b((Cursor) obj);
        }
    }
}
