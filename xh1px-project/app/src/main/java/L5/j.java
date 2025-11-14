package L5;

import android.text.Editable;

/* loaded from: classes.dex */
public final class j extends x5.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f2962d;

    public j(n nVar) {
        this.f2962d = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2962d.b().a();
    }

    @Override // x5.o, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        this.f2962d.b().b();
    }
}
