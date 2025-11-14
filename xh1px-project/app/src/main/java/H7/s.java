package H7;

import P.S;
import a6.AbstractC0436k;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class s implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2079d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f2080e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2081f;

    public s(S s8) {
        this.f2079d = 1;
        this.f2081f = new ArrayList();
        this.f2080e = s8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2079d) {
            case 0:
                return this.f2080e.hasNext();
            default:
                return this.f2080e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.f2079d) {
            case 0:
                return ((t) this.f2081f).f2083b.m(this.f2080e.next());
            default:
                Object next = this.f2080e.next();
                ArrayList arrayList = (ArrayList) this.f2081f;
                View view = (View) next;
                S s8 = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    s8 = new S(0, viewGroup);
                }
                if (s8 != null && s8.hasNext()) {
                    arrayList.add(this.f2080e);
                    this.f2080e = s8;
                } else {
                    while (!this.f2080e.hasNext() && !arrayList.isEmpty()) {
                        this.f2080e = (Iterator) AbstractC0436k.x0(arrayList);
                        a6.q.h0(arrayList);
                    }
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2079d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(t tVar) {
        this.f2079d = 0;
        this.f2081f = tVar;
        this.f2080e = tVar.f2082a.iterator();
    }
}
