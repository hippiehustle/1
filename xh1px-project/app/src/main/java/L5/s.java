package L5;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import o.E0;
import o.M;
import o.P;

/* loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3027e;

    public /* synthetic */ s(int i4, Object obj) {
        this.f3026d = i4;
        this.f3027e = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        Object item;
        int selectedItemPosition;
        switch (this.f3026d) {
            case 0:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) this.f3027e;
                E0 e02 = materialAutoCompleteTextView.f10233h;
                if (i4 < 0) {
                    if (!e02.f13056C.isShowing()) {
                        item = null;
                    } else {
                        item = e02.f13059f.getSelectedItem();
                    }
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i4);
                }
                MaterialAutoCompleteTextView.a(materialAutoCompleteTextView, item);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i4 < 0) {
                        if (!e02.f13056C.isShowing()) {
                            view = null;
                        } else {
                            view = e02.f13059f.getSelectedView();
                        }
                        if (!e02.f13056C.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = e02.f13059f.getSelectedItemPosition();
                        }
                        i4 = selectedItemPosition;
                        if (!e02.f13056C.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = e02.f13059f.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(e02.f13059f, view, i4, j);
                }
                e02.dismiss();
                return;
            case 1:
                M m6 = (M) this.f3027e;
                P p8 = m6.f13112J;
                p8.setSelection(i4);
                if (p8.getOnItemClickListener() != null) {
                    p8.performItemClick(view, i4, m6.f13109G.getItemId(i4));
                }
                m6.dismiss();
                return;
            default:
                ((SearchView) this.f3027e).n(i4);
                return;
        }
    }
}
