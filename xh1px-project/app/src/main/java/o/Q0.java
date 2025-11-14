package o;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class Q0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f13131a;

    public Q0(SearchView searchView) {
        this.f13131a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        SearchView searchView = this.f13131a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f8429O;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z8);
        }
    }
}
