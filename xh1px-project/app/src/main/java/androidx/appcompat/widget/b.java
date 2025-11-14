package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f8506d;

    public b(SearchView searchView) {
        this.f8506d = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.f8506d;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f8448s;
        if (searchView.f8444g0 != null) {
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f8444g0 != null && searchView.f8433S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i4 != 66 && i4 != 84 && i4 != 61) {
                        if (i4 != 21 && i4 != 22) {
                            if (i4 == 19) {
                                searchAutoComplete.getListSelection();
                                return false;
                            }
                        } else {
                            if (i4 == 21) {
                                length = 0;
                            } else {
                                length = searchAutoComplete.length();
                            }
                            searchAutoComplete.setSelection(length);
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            searchAutoComplete.a();
                            return true;
                        }
                    } else {
                        searchView.n(searchAutoComplete.getListSelection());
                        return true;
                    }
                }
            } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i4 == 66) {
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
        }
        return false;
    }
}
