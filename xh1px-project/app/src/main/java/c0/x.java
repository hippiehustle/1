package c0;

import a.AbstractC0405a;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x extends SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public final Class f9422d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9423e;

    public x(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f9423e = new ArrayList();
        AbstractC0405a.l(cls, "watcherClass cannot be null");
        this.f9422d = cls;
    }

    public final void a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f9423e;
            if (i4 < arrayList.size()) {
                ((w) arrayList.get(i4)).f9421e.incrementAndGet();
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f9423e;
            if (i4 < arrayList.size()) {
                ((w) arrayList.get(i4)).onTextChanged(this, 0, length(), length());
                i4++;
            } else {
                return;
            }
        }
    }

    public final w c(Object obj) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f9423e;
            if (i4 < arrayList.size()) {
                w wVar = (w) arrayList.get(i4);
                if (wVar.f9420d == obj) {
                    return wVar;
                }
                i4++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f9422d == obj.getClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i4, int i8) {
        super.delete(i4, i8);
        return this;
    }

    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f9423e;
            if (i4 < arrayList.size()) {
                ((w) arrayList.get(i4)).f9421e.decrementAndGet();
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        w c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        w c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        w c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i4, int i8, Class cls) {
        if (this.f9422d == cls) {
            w[] wVarArr = (w[]) super.getSpans(i4, i8, w.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, wVarArr.length);
            for (int i9 = 0; i9 < wVarArr.length; i9++) {
                objArr[i9] = wVarArr[i9].f9420d;
            }
            return objArr;
        }
        return super.getSpans(i4, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i4, int i8, Class cls) {
        if (cls == null || this.f9422d == cls) {
            cls = w.class;
        }
        return super.nextSpanTransition(i4, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        w wVar;
        if (d(obj)) {
            wVar = c(obj);
            if (wVar != null) {
                obj = wVar;
            }
        } else {
            wVar = null;
        }
        super.removeSpan(obj);
        if (wVar != null) {
            this.f9423e.remove(wVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i8, CharSequence charSequence) {
        replace(i4, i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i4, int i8, int i9) {
        if (d(obj)) {
            w wVar = new w(obj);
            this.f9423e.add(wVar);
            obj = wVar;
        }
        super.setSpan(obj, i4, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i8) {
        return new x(this.f9422d, this, i4, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i4, int i8) {
        super.delete(i4, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i8, CharSequence charSequence, int i9, int i10) {
        replace(i4, i8, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence, int i8, int i9) {
        super.insert(i4, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i8, CharSequence charSequence) {
        a();
        super.replace(i4, i8, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence, int i8, int i9) {
        super.insert(i4, charSequence, i8, i9);
        return this;
    }

    public x(Class cls, x xVar, int i4, int i8) {
        super(xVar, i4, i8);
        this.f9423e = new ArrayList();
        AbstractC0405a.l(cls, "watcherClass cannot be null");
        this.f9422d = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i8, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i4, i8, charSequence, i9, i10);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i4, int i8) {
        super.append(charSequence, i4, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i4, int i8) {
        super.append(charSequence, i4, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i8) {
        super.append(charSequence, i4, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}
