package C2;

import A1.e;
import O7.i0;
import W0.d;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class b implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f585d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f586e;

    public /* synthetic */ b(int i4, Object obj) {
        this.f585d = i4;
        this.f586e = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f585d) {
            case 0:
                ((e) this.f586e).m(String.valueOf(editable));
                return;
            case 1:
                if (editable != null) {
                    ((InterfaceC1163b) this.f586e).m(editable);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        int i10 = this.f585d;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        switch (this.f585d) {
            case 0:
            case 1:
                return;
            default:
                SearchView searchView = (SearchView) this.f586e;
                Editable text = searchView.f8448s.getText();
                searchView.f8441d0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.v(!isEmpty);
                int i10 = 8;
                if (searchView.f8439b0 && !searchView.f8432R && isEmpty) {
                    searchView.f8453x.setVisibility(8);
                    i10 = 0;
                }
                searchView.f8455z.setVisibility(i10);
                searchView.r();
                searchView.u();
                if (searchView.f8428N != null && !TextUtils.equals(charSequence, searchView.f8440c0)) {
                    ((i0) ((ScenarioListFragment) ((d) searchView.f8428N).f6489e).S().f6625b.f281f).g(charSequence.toString());
                }
                searchView.f8440c0 = charSequence.toString();
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i4, int i8, int i9, CharSequence charSequence) {
    }

    private final void c(int i4, int i8, int i9, CharSequence charSequence) {
    }

    private final void d(int i4, int i8, int i9, CharSequence charSequence) {
    }

    private final void e(int i4, int i8, int i9, CharSequence charSequence) {
    }

    private final void f(int i4, int i8, int i9, CharSequence charSequence) {
    }
}
