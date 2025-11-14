package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f8507d;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f8507d = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f8507d;
        if (searchAutoComplete.j) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.j = false;
        }
    }
}
