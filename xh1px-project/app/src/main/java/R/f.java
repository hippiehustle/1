package R;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: d, reason: collision with root package name */
    public final InputContentInfo f4984d;

    public f(Object obj) {
        this.f4984d = (InputContentInfo) obj;
    }

    @Override // R.h
    public final ClipDescription a() {
        return this.f4984d.getDescription();
    }

    @Override // R.h
    public final Object b() {
        return this.f4984d;
    }

    @Override // R.h
    public final Uri c() {
        return this.f4984d.getContentUri();
    }

    @Override // R.h
    public final void d() {
        this.f4984d.requestPermission();
    }

    @Override // R.h
    public final Uri e() {
        return this.f4984d.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f4984d = new InputContentInfo(uri, clipDescription, uri2);
    }
}
