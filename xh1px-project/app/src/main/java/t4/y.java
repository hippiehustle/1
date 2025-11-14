package t4;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f15120a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15121b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15122c;

    public y(String str, float f8, float f9) {
        this.f15120a = str;
        this.f15121b = f8;
        this.f15122c = f9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (!this.f15120a.equals(yVar.f15120a) || Float.compare(this.f15121b, yVar.f15121b) != 0 || Float.compare(400.0f, 400.0f) != 0 || Float.compare(this.f15122c, yVar.f15122c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15122c) + ((Float.hashCode(400.0f) + ((Float.hashCode(this.f15121b) + (this.f15120a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UiDetectionQuality(displayText=" + this.f15120a + ", qualityValue=" + this.f15121b + ", min=400.0, max=" + this.f15122c + ")";
    }
}
